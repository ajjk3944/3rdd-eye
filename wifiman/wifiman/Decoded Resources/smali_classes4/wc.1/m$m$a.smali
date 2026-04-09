.class final Lwc/m$m$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lwc/m$m;->a(Ljava/lang/Boolean;)LDj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lwc/m;


# direct methods
.method constructor <init>(Lwc/m;)V
    .locals 0

    iput-object p1, p0, Lwc/m$m$a;->a:Lwc/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lwc/d$b;)LDj/a;
    .locals 1

    const-string v0, "receiverStatus"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lwc/d$b$b;

    if-eqz v0, :cond_0

    new-instance p1, Lwc/m$m$a$a;

    invoke-direct {p1}, Lwc/m$m$a$a;-><init>()V

    invoke-static {p1}, Lgg/b;->r(Lgg/e;)Lgg/b;

    move-result-object p1

    const-string v0, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LZg/d0;->e()Ljava/util/Set;

    move-result-object v0

    invoke-static {v0}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object v0

    invoke-virtual {p1, v0}, Lgg/b;->h(LDj/a;)Lgg/i;

    move-result-object p1

    const-string v0, "andThen(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lwc/d$b$a;

    if-eqz v0, :cond_1

    check-cast p1, Lwc/d$b$a;

    invoke-virtual {p1}, Lwc/d$b$a;->a()Lwc/d$a;

    move-result-object p1

    sget-object v0, Lwc/d$a;->STATE_ON:Lwc/d$a;

    if-ne p1, v0, :cond_1

    iget-object p1, p0, Lwc/m$m$a;->a:Lwc/m;

    invoke-static {p1}, Lwc/m;->h(Lwc/m;)Lgg/i;

    move-result-object p1

    goto :goto_0

    :cond_1
    invoke-static {}, LZg/d0;->e()Ljava/util/Set;

    move-result-object p1

    invoke-static {p1}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    const-string v0, "just(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lwc/d$b;

    invoke-virtual {p0, p1}, Lwc/m$m$a;->a(Lwc/d$b;)LDj/a;

    move-result-object p1

    return-object p1
.end method
