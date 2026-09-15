<div id="top">

<!-- HEADER STYLE: BANNER -->
<div align="center">

	<defs>
		<linearGradient id="bg" x1="0%" y1="0%" x2="100%" y2="100%">
			<stop offset="0%" style="stop-color:#2de537;stop-opacity:1" />
			<stop offset="50%" style="stop-color:#2de5a5;stop-opacity:1" />
			<stop offset="100%" style="stop-color:#2db7e5;stop-opacity:1" />
		</linearGradient>
		<filter id="shadow">
			<feDropShadow dx="2.0" dy="2.0" stdDeviation="4.0" flood-opacity="0.5" />
		</filter>
		<pattern id="dots" width="20.0" height="20.0" patternUnits="userSpaceOnUse">
			<circle cx="3" cy="3" r="1.5" fill="rgba(255,255,255,0.2)" />
		</pattern>
	</defs>
	<rect width="100%" height="100%" fill="url(#bg)" rx="5.0" />
	<rect width="100%" height="100%" fill="url(#dots)" />
	<circle cx="64.0" cy="50.0" r="30.0" fill="rgba(255,255,255,0.8)" />
	<circle cx="736.0" cy="150.0" r="40.0" fill="rgba(255,255,255,0.8)" />
	<path d="M 400.0 25.0
			 L 450.0 75.0
			 L 350.0 75.0 Z" fill="rgba(255,255,255,0.8)" />
	<text x="400.0" y="100.0" font-family="Arial, sans-serif" font-size="24" font-weight="bold" text-anchor="middle" fill="#FFFFFF" filter="url(#shadow)">
		7-familles
	</text>
	<text x="400.0" y="150.0" font-family="Arial, sans-serif" font-size="18" text-anchor="middle" fill="rgba(255,255,255,0.9)">
</text></svg>

<!-- BADGES -->
<img src="https://img.shields.io/github/license/LTherage/7-familles?style=for-the-badge&logo=opensourceinitiative&logoColor=white&color=1F75FE" alt="license">
<img src="https://img.shields.io/github/last-commit/LTherage/7-familles?style=for-the-badge&logo=git&logoColor=white&color=1F75FE" alt="last-commit">
<img src="https://img.shields.io/github/languages/top/LTherage/7-familles?style=for-the-badge&color=1F75FE" alt="repo-top-language">
<img src="https://img.shields.io/github/languages/count/LTherage/7-familles?style=for-the-badge&color=1F75FE" alt="repo-language-count">

<em>Built with the tools and technologies:</em>

- Java
- Swing / AWT
- IntelliJ IDEA

</div>

---

## 📖 Table of Contents

<details>
<summary>Table of Contents</summary>

- [📖 Table of Contents](#-table-of-contents)
- [🎉 Overview](#-overview)
- [🦄 Features](#-features)
- [🎨 Project Structure](#-project-structure)
    - [📚 Project Index](#-project-index)
- [🚀 Getting Started](#-getting-started)
    - [📝 Prerequisites](#-prerequisites)
    - [🛠️ Installation](#-installation)
    - [🤖 Usage](#-usage)
    - [🧪 Testing](#-testing)
- [✨ Roadmap](#-roadmap)
- [🤗 Contributing](#-contributing)
- [📃 License](#-license)
- [👏 Acknowledgments](#-acknowledgments)

</details>

---

## 🎉 Overview

<code>❯ 7-familles</code> est une implémentation Java du jeu de cartes "Les 7 Familles". Le joueur joue contre l'ordinateur via une interface Swing, demande des cartes, complète des familles thématiques et tente de finir avec le plus grand nombre de familles validées.

Le projet est structuré autour de trois classes principales : une classe `Joueur`, une classe `GestionJoueurs` et la fenêtre principale `Jeu7Familles`, qui gère le deck, la main du joueur, l'IA et la logique de victoire.

---

## 🦄 Features

<code>❯ Jeu de cartes inspiré du jeu des 7 familles</code>

<code>❯ Interface graphique Swing avec boutons et fenêtre principale</code>

<code>❯ Mélange aléatoire du paquet et distribution de cartes</code>

<code>❯ Détection automatique des familles complètes</code>

<code>❯ Gestion des joueurs avec ajout/suppression et vérification des doublons</code>

<code>❯ Tour de l'ordinateur avec pioche et demande de cartes</code>

<code>❯ Fin de partie avec calcul du gagnant selon le nombre de familles complétées</code>

---

## 🎨 Project Structure

```sh
└── 7-familles/
    ├── .idea/
    ├── .gitignore
    ├── README.md
    ├── Projet 7 familles.iml
    └── src
        ├── GestionJoueurs.java
        ├── Jeu7Familles.java
        └── Joueur.java
```

### 📚 Project Index

<details open>
<summary><b><code>7-FAMILLES/</code></b></summary>
<!-- __root__ Submodule -->
<details>
	<summary><b>__root__</b></summary>
	<blockquote>
		<div class='directory-path' style='padding: 8px 0; color: #666;'>
			<code><b>⦿ __root__</b></code>
		<table style='width: 100%; border-collapse: collapse;'>
		<thead>
			<tr style='background-color: #f8f9fa;'>
				<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
				<th style='text-align: left; padding: 8px;'>Summary</th>
			</tr>
		</thead>
		</table>
	</blockquote>
</details>
<!-- src Submodule -->
<details>
	<summary><b>src</b></summary>
	<blockquote>
		<div class='directory-path' style='padding: 8px 0; color: #666;'>
			<code><b>⦿ src</b></code>
		<table style='width: 100%; border-collapse: collapse;'>
		<thead>
			<tr style='background-color: #f8f9fa;'>
				<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
				<th style='text-align: left; padding: 8px;'>Summary</th>
			</tr>
		</thead>
			<tr style='border-bottom: 1px solid #eee;'>
				<td style='padding: 8px;'><b><a href='https://github.com/LTherage/7-familles/blob/master/src/Jeu7Familles.java'>Jeu7Familles.java</a></b></td>
				<td style='padding: 8px;'><code>❯ Point d'entrée principal du jeu, interface Swing, deck, tour et logique de victoire.</code></td>
			</tr>
			<tr style='border-bottom: 1px solid #eee;'>
				<td style='padding: 8px;'><b><a href='https://github.com/LTherage/7-familles/blob/master/src/GestionJoueurs.java'>GestionJoueurs.java</a></b></td>
				<td style='padding: 8px;'><code>❯ Gestion de la liste des joueurs, ajout, suppression et validation des doublons.</code></td>
			</tr>
			<tr style='border-bottom: 1px solid #eee;'>
				<td style='padding: 8px;'><b><a href='https://github.com/LTherage/7-familles/blob/master/src/Joueur.java'>Joueur.java</a></b></td>
				<td style='padding: 8px;'><code>❯ Modèle du joueur avec sa main, ses familles complétées et ses informations perso.</code></td>
			</tr>
		</table>
	</blockquote>
</details>
</details>

---

## 🚀 Getting Started

### 📝 Prerequisites

This project requires the following dependencies:

- **Programming Language:** Java 8 or later
- **Runtime:** Java Swing (included in the JDK)

### 🛠️ Installation

Clone the project and compile the source files:

1. **Clone the repository:**

    ```sh
    ❯ git clone https://github.com/LTherage/7-familles
    ```

2. **Navigate to the project directory:**

    ```sh
    ❯ cd 7-familles
    ```

3. **Compile the Java sources:**

    ```sh
    ❯ javac src/*.java
    ```

### 🤖 Usage

Run the game from the repository root:

```sh
❯ java -cp src Jeu7Familles
```

### 🧪 Testing

No automated test suite is currently defined in this repository. The project is validated manually by launching the game and checking the card-flow, family completion and end-of-game logic.

---

## ✨ Roadmap

- [X] **`Jeu jouable`**: <strike>Interface Swing, deck, familles et tour de jeu fonctionnels.</strike>
- [X] **`Gestion des joueurs`**: <strike>Ajout, suppression et contrôle des doublons.</strike>
- [ ] **`Amélioration de l'IA`**: Ajouter un comportement plus avancé pour les demandes de cartes.
- [ ] **`Score et rejouer`**: Ajouter un tableau de score et une option pour relancer une partie.
- [ ] **`Règles complètes`**: Étendre la logique pour coller encore plus précisément aux règles du jeu des 7 familles.

---

## 🤗 Contributing

- **💬 [Join the Discussions](https://github.com/LTherage/7-familles/discussions)**: Share your insights, provide feedback, or ask questions.
- **🐛 [Report Issues](https://github.com/LTherage/7-familles/issues)**: Submit bugs found or log feature requests for the `7-familles` project.
- **💡 [Submit Pull Requests](https://github.com/LTherage/7-familles/blob/main/CONTRIBUTING.md)**: Review open PRs, and submit your own PRs.

<details closed>
<summary>Contributing Guidelines</summary>

1. **Fork the Repository**: Start by forking the project repository to your GitHub account.
2. **Clone Locally**: Clone the forked repository to your local machine using a git client.
   ```sh
   git clone https://github.com/LTherage/7-familles
   ```
3. **Create a New Branch**: Always work on a new branch, giving it a descriptive name.
   ```sh
   git checkout -b feature/new-game-rule
   ```
4. **Make Your Changes**: Develop and test your changes locally.
5. **Commit Your Changes**: Commit with a clear message describing your updates.
   ```sh
   git commit -m 'Ajout d'une règle de jeu améliorée'
   ```
6. **Push to GitHub**: Push the changes to your forked repository.
   ```sh
   git push origin feature/new-game-rule
   ```
7. **Submit a Pull Request**: Create a PR against the original project repository. Clearly describe the changes and their motivations.
8. **Review**: Once your PR is reviewed and approved, it will be merged into the main branch. Congratulations on your contribution!
</details>

<details closed>
<summary>Contributor Graph</summary>
<br>
<p align="left">
   <a href="https://github.com/LTherage/7-familles/graphs/contributors">
      <img src="https://contrib.rocks/image?repo=LTherage/7-familles">
   </a>
</p>
</details>

---

## 📃 License

This repository does not currently include a dedicated `LICENSE` file in the project root. If you plan to distribute or publish the game, add a license and update this section accordingly before release.

---

## 👏 Acknowledgments

- Java Swing for the graphical interface
- IntelliJ IDEA for local development
- The classic game of "Les 7 Familles" for inspiration

<div align="right">

[![][back-to-top]](#top)

</div>


[back-to-top]: https://img.shields.io/badge/-BACK_TO_TOP-151515?style=flat-square


---
