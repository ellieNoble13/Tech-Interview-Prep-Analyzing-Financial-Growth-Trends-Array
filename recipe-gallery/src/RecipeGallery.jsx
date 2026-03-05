import React from 'react';
import { recipes } from './recipes.js'; // This is your data source

function RecipeGallery() {
    return (
        <div className="recipe-container">
            <h1>Ellie's Cool Recipes</h1>

            <div className="recipe-grid">

                {recipes.map((recipe) => (

                    <div key={recipe.id} className="recipe-card">

                        <h2>{recipe.title}</h2>

                        <img
                            src={recipe.image}
                            alt={`A delicious plate of ${recipe.title}`}
                            className="recipe-image"
                        />

                        <div className="recipe-details">
                            <h3>Ingredients:</h3>
                            <ul>
                                {recipe.ingredients.map((ingredient, index) => (
                                    <li key={index}>{ingredient}</li>
                                ))}
                            </ul>
                        </div>
                    </div>
                ))}
            </div>
        </div>
    );
}

export default RecipeGallery;
