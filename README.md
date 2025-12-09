1. Clone โปรเจกต์ ใน git
2. ตั้งค่า Database ของตัวเองใน appilcation.properties
3. เข้า http://localhost:8080/swagger-ui/index.html#/bunlung-controller
4. ใส่ข้อมูลลงในเส้น POST /service/gentoken {
  "ssoType": "SSOData",
  "systemId": "VATDEDEV",
  "systemName": "ระบบบันทึกข้อมูลภาษีมูลค่าเพิ่มทดสอบ)",
  "systemTransactions": "PRIV-010,PRIV-020,PRIV-040,PRIV-050",
  "systemPrivileges": "0|0|0|0",
  "systemUserGroup": "GRP-010,GRP-020,GRP-040",
  "systemLocationGroup": "CliC001",
  "userId": "WS233999",
  "userFullName": "ประสาท จันทร์อังคาร ",
  "userRdOfficeCode": "01000999",
  "userOfficeCode": "01001139",
  "clientLocation": "01001139",
  "locationMachineNumber": "CLI00000718-9999",
  "tokenId":  "eyJzdWIiOiIxMjM0IiwiYXVkIjpbImFkbWluIl0sImlzcyI6Im1hc29uLm1ldGFtdWcubmV0IiwiZXhwIjoxNTc0NTEyNzY1LCJpYXQiOjE1NjY3MzY3NjUsImp0aSI6ImY3YmZlMzNmLTdiZjctNGViNC04ZTU5LTk5MTc5OWI1ZWI4YSJ9"
}

5. ถ้าเพิ่มข้อมูลได้จะแสดงผล
   {
  "responseCode": "I07000",
  "responseMessage": "ทำการเรียบร้อย",
  "responseData": {
    "userId": "WS233999",
    "tokenId": "eyJzdWIiOiIxMjM0IiwiYXVkIjpbImFkbWluIl0sImlzcyI6Im1hc29uLm1ldGFtdWcubmV0IiwiZXhwIjoxNTc0NTEyNzY1LCJpYXQiOjE1NjY3MzY3NjUsImp0aSI6ImY3YmZlMzNmLTdiZjctNGViNC04ZTU5LTk5MTc5OWI1ZWI4YSJ9"
  }
}
6. ถ้าเพิ่มข้อมูลไม่ได้จะแสดง error400 แต่ต้องเพิ่มค่าว่างหรือค่าNullถึงจะขึ้น
{
  "responseCode": "E000001",
  "responseMessage": "400 BAD_REQUEST \"ไม่มีข้อมูลSsoType\"ไม่สามารถบันทึกข้อมูลลงฐานข้อมูลได้",
  "responseData": {
    "userId": "WS233999",
    "tokenId": "eyJzdWIiOiIxMjM0IiwiYXVkIjpbImFkbWluIl0sImlzcyI6Im1hc29uLm1ldGFtdWcubmV0IiwiZXhwIjoxNTc0NTEyNzY1LCJpYXQiOjE1NjY3MzY3NjUsImp0aSI6ImY3YmZlMzNmLTdiZjctNGViNC04ZTU5LTk5MTc5OWI1ZWI4YSJ9"
  }
}
7. ถ้า error 500 จะแสดง
   {
  "responseCode": "E000001",
  "responseMessage": "500 INTERNAL_SERVER_ERROR \"ไม่พบฐานข้อมูล หรือเกิดข้อผิดพลาดภายในระบบ\"ไม่สามารถบันทึกข้อมูลลงฐานข้อมูลได้",
  "responseData": {
    "userId": "WS233999",
    "tokenId": "eyJzdWIiOiIxMjM0IiwiYXVkIjpbImFkbWluIl0sImlzcyI6Im1hc29uLm1ldGFtdWcubmV0IiwiZXhwIjoxNTc0NTEyNzY1LCJpYXQiOjE1NjY3MzY3NjUsImp0aSI6ImY3YmZlMzNmLTdiZjctNGViNC04ZTU5LTk5MTc5OWI1ZWI4YSJ9"
  }
}

