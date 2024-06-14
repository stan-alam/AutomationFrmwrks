from Lib import AuthFunctions
from Lib import Environments
import asyncio
import asynchronize

'''controller for token'''
class Controller:

    def controller(driver, options, callback):
        AuthFunctions.get_jwt(driver, function(token))

        if(options.action == 'get_jwt'):
            jwt = AuthFunctions.getjwt()
            return jwt
        
        if(options.action == 'get_accesstoken'):
            access_token = AuthFunctions.getjwt()
            return access_token
         
        elif(options.action == 'get_token_endpoint'):
            '''token_endpoint = '''
        
        

