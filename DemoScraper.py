# Selenium Demo Project
from selenium import webdriver
# selenium modules
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
# used to import keyboard buttons
# into commands we can use
from selenium.webdriver.common.keys import Keys
import time

PATH = "C:\Program Files (x86)\chromedriver.exe"

driver = webdriver.Chrome(PATH)

driver.get('https://www.techwithtim.net/')

'''print(driver.title)'''

search = driver.find_element_by_name('s')

# adds text to search bar through 'keys' module
search.send_keys("test")
search.send_keys(Keys.RETURN)

try:
    main = WebDriverWait(driver, 10).until(
        EC.presence_of_element_located((By.ID, "main"))
    
    )
    
    articles = driver.find_elements_by_tag_name("article")
    for article in articles:
        header = driver.find_element_by_class_name("entry-title")
        print(header.text)
finally:
    driver.quit()

'''print(driver.page_source)'''
'''driver.sleep(5)'''
'''main = driver.find_element_by_id("main")'''

driver.quit()

