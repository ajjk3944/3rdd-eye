.class public final synthetic LA5/v;
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
    .locals 2

    new-instance v0, LA5/k;

    const-class v1, Landroid/content/Context;

    invoke-interface {p1, v1}, LF4/d;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    invoke-direct {v0, p1}, LA5/k;-><init>(Landroid/content/Context;)V

    return-object v0
.end method
