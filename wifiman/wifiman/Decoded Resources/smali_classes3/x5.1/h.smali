.class public final synthetic Lx5/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LF4/g;


# direct methods
.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LF4/d;)Ljava/lang/Object;
    .locals 3

    new-instance v0, Lz5/c$a;

    const-class v1, Lz5/a;

    const-class v2, Ly5/a;

    invoke-interface {p1, v2}, LF4/d;->e(Ljava/lang/Class;)Lf5/b;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lz5/c$a;-><init>(Ljava/lang/Class;Lf5/b;)V

    return-object v0
.end method
