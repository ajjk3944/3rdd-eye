.class final Lj8/c$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lj8/c;-><init>(Landroid/content/Context;Lmd/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lj8/c;


# direct methods
.method constructor <init>(Lj8/c;)V
    .locals 0

    iput-object p1, p0, Lj8/c$e;->a:Lj8/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LT7/b;)V
    .locals 3

    const-string/jumbo v0, "daynight"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lj8/c$e;->a:Lj8/c;

    invoke-static {v1}, Lj8/c;->g(Lj8/c;)Landroid/content/SharedPreferences;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    iget-object v2, p0, Lj8/c$e;->a:Lj8/c;

    invoke-static {v2, p1}, Lj8/c;->f(Lj8/c;LT7/b;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v1, v0, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, LT7/b;

    invoke-virtual {p0, p1}, Lj8/c$e;->a(LT7/b;)V

    return-void
.end method
