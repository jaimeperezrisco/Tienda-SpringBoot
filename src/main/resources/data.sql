-- Datos para la tabla Cliente (Client)
INSERT INTO Cliente (nombre, apellidos, direccion, email, telefono) VALUES
('Ana', 'García López', 'C/ Sol, 12, Madrid', 'ana.garcia@email.com', '600111222'),
('Luis', 'Pérez Ruiz', 'Av. Luna, 5, Barcelona', 'luis.perez@email.com', '600333444'),
('María', 'Sánchez Torres', 'Plaza Mayor, 3, Sevilla', 'maria.sanchez@email.com', '600555666');

-- Datos para la tabla Empleado (Employee)
INSERT INTO Empleado (nombre, puesto, salario, fecha_contratacion) VALUES
('Javier', 'Gerente', 45000, '2020-01-15'),
('Elena', 'Vendedor', 28000, '2022-05-20'),
('Roberto', 'Almacén', 22000, '2023-11-01');

-- Datos para la tabla Producto (Product)
INSERT INTO Producto (nombre, descripcion, precio, stock, categoria) VALUES
('Laptop Pro X', 'Portátil de alto rendimiento', 1200.50, 15, 'Electrónica'),
('Teclado Mecánico', 'Teclado RGB con switches azules', 85.99, 50, 'Periféricos'),
('Monitor Curvo 32"', 'Monitor 4K para gaming', 450.00, 10, 'Electrónica'),
('Ratón Inalámbrico', 'Ratón ergonómico recargable', 35.00, 120, 'Periféricos');

-- Datos para la tabla Pedido (Order)
INSERT INTO Pedido (fecha, total, metodo_pago, estado,producto_id) VALUES
('2024-03-10', 1286, 'Tarjeta', 'Enviado',1),
('2024-03-11', 485, 'PayPal', 'Pendiente',1),
('2024-03-12', 35, 'Transferencia', 'Entregado',2);