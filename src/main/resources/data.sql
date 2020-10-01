insert into users(username, password, enabled)
values('sread', '$2a$10$qtMTPmTobfiMPdYP7QeQpuKV7Rm38p28T1Qswa..1eWGsq82P4OP2', 'T');

insert into users(username, password, enabled)
values('mgreen', '$2a$10$f0Wyv6bFgaGxgZVLLd4.Eud3GnOjmmGLMNrVm1Yp9Z7nH5jIWDyDC', 'T');

insert into users(username, password, enabled)
values('csandals', '$2a$10$zw2qtrrxpDx3wHJKNyxti.MqXNxSeSwPPmp4cPXWM56JlGMOXF2uq', 'T');

insert into authorities(username, authority)
values ('sread', 'employee');

insert into authorities(username, authority)
values ('mgreen', 'employee');

insert into authorities(username, authority)
values ('csandals', 'major');