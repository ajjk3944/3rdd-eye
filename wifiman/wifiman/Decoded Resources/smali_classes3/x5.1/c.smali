.class public final synthetic Lx5/c;
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
    .locals 1

    const-class v0, Lz5/c$a;

    invoke-interface {p1, v0}, LF4/d;->g(Ljava/lang/Class;)Ljava/util/Set;

    move-result-object p1

    new-instance v0, Lz5/c;

    invoke-direct {v0, p1}, Lz5/c;-><init>(Ljava/util/Set;)V

    return-object v0
.end method
