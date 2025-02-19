# Spring Bank Microservices

Application bancaire basée sur une architecture microservices développée avec Spring Boot.

![Java](https://img.shields.io/badge/Java-17-orange)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-green)
![License](https://img.shields.io/badge/License-MIT-blue)

## 🏦 Présentation

Cette application bancaire propose trois services principaux :
- **Service des comptes** : Gestion des comptes clients
- **Service des cartes** : Gestion des cartes bancaires
- **Service des prêts** : Gestion des prêts bancaires

## 🛠 Technologies utilisées

- Java 17
- Spring Boot 3.x
- Spring Data JPA
- Maven
- Base de données SQL
- JUnit pour les tests

## 📁 Structure du projet

```
bank-app/
├── accounts-service/    # Gestion des comptes clients
├── cards-service/       # Gestion des cartes bancaires
└── loans-service/       # Gestion des prêts
```

Chaque service suit une architecture en couches :
- Controllers (API REST)
- Services (Logique métier)
- Repositories (Accès aux données)
- Entities (Modèles de données)
- DTOs (Objets de transfert)
- Exceptions (Gestion des erreurs)

## 🚀 Installation

1. Cloner le repository
```bash
git clone https://github.com/votre-username/spring-bank-microservices.git
```

2. Construire le projet
```bash
cd spring-bank-microservices
mvn clean install
```

3. Lancer les services
```bash
cd accounts-service
mvn spring-boot:run

cd ../cards-service
mvn spring-boot:run

cd ../loans-service
mvn spring-boot:run
```

## 📡 API Endpoints

### Accounts Service
- `GET /api/accounts/{id}` - Récupérer un compte
- `POST /api/accounts` - Créer un compte
- `PUT /api/accounts/{id}` - Mettre à jour un compte

### Cards Service
- `GET /api/cards/{id}` - Récupérer une carte
- `POST /api/cards` - Créer une carte
- `PUT /api/cards/{id}` - Mettre à jour une carte

### Loans Service
- `GET /api/loans/{id}` - Récupérer un prêt
- `POST /api/loans` - Créer un prêt
- `PUT /api/loans/{id}` - Mettre à jour un prêt

## 🤝 Contribution

Les contributions sont les bienvenues ! N'hésitez pas à :
1. Fork le projet
2. Créer votre branche (`git checkout -b feature/AmazingFeature`)
3. Commit vos changements (`git commit -m 'Add some AmazingFeature'`)
4. Push sur la branche (`git push origin feature/AmazingFeature`)
5. Ouvrir une Pull Request

## 📝 License

Ce projet est sous licence MIT. Voir le fichier `LICENSE` pour plus de détails.

## 📧 Contact

Votre Nom - [Oujjet)

Lien du projet: [https://github.com/votre-username/spring-bank-microservices](https://github.com/votre-username/spring-bank-microservices)
