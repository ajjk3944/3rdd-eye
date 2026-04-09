.class public abstract Lm6/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln6/b;


# instance fields
.field private final synthetic a:Ln6/a;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ln6/a;

    invoke-direct {v0}, Ln6/a;-><init>()V

    iput-object v0, p0, Lm6/a;->a:Ln6/a;

    return-void
.end method


# virtual methods
.method public a()Lw6/c;
    .locals 1

    iget-object v0, p0, Lm6/a;->a:Ln6/a;

    invoke-virtual {v0}, Ln6/a;->a()Lw6/c;

    move-result-object v0

    return-object v0
.end method

.method public abstract b(Lu6/b;FFFF)V
.end method
