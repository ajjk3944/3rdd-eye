.class public abstract Lm4/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lm4/g;
    .locals 1

    invoke-static {}, Lm4/a;->h()Lm4/g;

    move-result-object v0

    return-object v0
.end method

.method public static g(Ljava/lang/Object;)Lm4/g;
    .locals 1

    new-instance v0, Lm4/i;

    invoke-static {p0}, Lm4/h;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    invoke-direct {v0, p0}, Lm4/i;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method


# virtual methods
.method public abstract c()Ljava/lang/Object;
.end method

.method public abstract d()Z
.end method
