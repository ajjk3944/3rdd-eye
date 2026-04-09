.class final LN8/f$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN8/f;-><init>(Lcom/ui/wifiman/model/android/permissions/d;Lde/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LN8/f;


# direct methods
.method constructor <init>(LN8/f;)V
    .locals 0

    iput-object p1, p0, LN8/f$e;->a:LN8/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Boolean;)LDj/a;
    .locals 2

    const-string/jumbo v0, "locationHandled"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, LN8/f$e;->a:LN8/f;

    invoke-static {p1}, LN8/f;->j(LN8/f;)Lcom/ui/wifiman/model/android/permissions/d;

    move-result-object p1

    invoke-interface {p1}, Lcom/ui/wifiman/model/android/permissions/d;->b()Lgg/i;

    move-result-object p1

    sget-object v0, LN8/f$e$a;->a:LN8/f$e$a;

    invoke-virtual {p1, v0}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    sget-object v0, LN8/f$e$b;->a:LN8/f$e$b;

    invoke-virtual {p1, v0}, Lgg/i;->m0(Lkg/p;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->o0()Lgg/z;

    move-result-object p1

    new-instance v0, LN8/f$e$c;

    iget-object v1, p0, LN8/f$e;->a:LN8/f;

    invoke-direct {v0, v1}, LN8/f$e$c;-><init>(LN8/f;)V

    invoke-virtual {p1, v0}, Lgg/z;->t(Lkg/n;)Lgg/b;

    move-result-object p1

    invoke-virtual {p1}, Lgg/b;->c0()Lgg/i;

    move-result-object p1

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p1, v0}, Lgg/i;->z1(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    goto :goto_0

    :cond_0
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p1}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, LN8/f$e;->a(Ljava/lang/Boolean;)LDj/a;

    move-result-object p1

    return-object p1
.end method
