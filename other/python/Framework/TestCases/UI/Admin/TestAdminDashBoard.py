import time
import json
from selenium import webdriver
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.chrome.options import Options
from selenium.webdriver.common.by import By
from selenium.common.exceptions import NoSuchElementException
from selenium.common.exceptions import ElementNotVisibleException
from selenium.common.exceptions import ElementNotInteractableException
from selenium.webdriver.support.wait import WebDriverWait
from Lib import adminfunctions
from Lib import authfunctions
from Lib import gatewayfunctions

'''from requests import Request'''


def LoadConfigurations():
    '''This will load configs'''
    

def RunTest():
    configFile = open('./Framework/TestCases/UI/Admin/virtualUsertemplate.json')
    '''xpaths     = open('./Scripts/xpaths.json')'''
    errors = [NoSuchElementException, ElementNotInteractableException]
    configjson = json.load(configFile)
    url ='https://'+ configjson['LsHost'] + '/#/login'
    options = Options()
    normal = options.page_load_strategy = 'normal'
    options.add_argument('--allow-running-insecure-content')
    options.add_argument('--ignore-certificate-errors')
    options.add_argument(normal)
    chromedriver = webdriver.Chrome(options=options)
    wait   = WebDriverWait(chromedriver, timeout=3, poll_frequency=.2, ignored_exceptions=errors)  
    chromedriver.get(url)
    time.sleep(3)
    loginfield = chromedriver.find_element(By.NAME,'email')
    loginfield.send_keys("admin@stantest.com")
    passwordfield = chromedriver.find_element(By.NAME,'password')
    passwordfield.send_keys('password')
    signinbutton = chromedriver.find_element(By.ID, 'sign-in')
    signinbutton.click()
    '''here read the xpath from the xpaths.json and call with expression'''
    wait.until(lambda a : chromedriver.find_element(By.XPATH, '//div[@class="glyphicon glyphicon-menu-hamburgLer main-header-icon ng-scope"]').click() or True) # this will read from a config file
    '''sleep is for demo'''
    time.sleep(10)
    chromedriver.quit()
RunTest()

