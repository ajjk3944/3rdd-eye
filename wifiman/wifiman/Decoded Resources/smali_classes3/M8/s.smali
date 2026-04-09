.class public final synthetic LM8/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# direct methods
.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lle/f;

    check-cast p2, Ljava/lang/String;

    invoke-static {p1, p2}, LM8/t;->h(Lle/f;Ljava/lang/String;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
