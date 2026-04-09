.class final LOa/c$d;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LOa/c;-><init>(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LOa/c;


# direct methods
.method constructor <init>(LOa/c;)V
    .locals 0

    iput-object p1, p0, LOa/c$d;->a:LOa/c;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Landroid/accounts/AccountManager;
    .locals 1

    iget-object v0, p0, LOa/c$d;->a:LOa/c;

    invoke-virtual {v0}, LOa/c;->c()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/accounts/AccountManager;->get(Landroid/content/Context;)Landroid/accounts/AccountManager;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LOa/c$d;->a()Landroid/accounts/AccountManager;

    move-result-object v0

    return-object v0
.end method
