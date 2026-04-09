.class public abstract LLj/b$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LLj/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method abstract a()LLj/b;
.end method

.method public b()LLj/b;
    .locals 2

    new-instance v0, Landroid/graphics/Rect;

    invoke-virtual {p0}, LLj/b$a;->c()Landroid/graphics/Rect;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    invoke-virtual {p0, v0}, LLj/b$a;->e(Landroid/graphics/Rect;)LLj/b$a;

    invoke-virtual {p0}, LLj/b$a;->a()LLj/b;

    move-result-object v0

    return-object v0
.end method

.method abstract c()Landroid/graphics/Rect;
.end method

.method public abstract d(LLj/b$b;)LLj/b$a;
.end method

.method public abstract e(Landroid/graphics/Rect;)LLj/b$a;
.end method
