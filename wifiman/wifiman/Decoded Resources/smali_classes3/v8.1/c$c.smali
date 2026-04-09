.class final Lv8/c$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lv8/c;->o0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lv8/c;


# direct methods
.method constructor <init>(Lv8/c;)V
    .locals 0

    iput-object p1, p0, Lv8/c$c;->a:Lv8/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LSd/d$a$a$a;)Lgg/f;
    .locals 2

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LSd/d$a$a$a;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, LSd/d$a$a$a;->b()Ljava/util/Set;

    move-result-object p1

    iget-object v1, p0, Lv8/c$c;->a:Lv8/c;

    invoke-static {v1}, Lv8/c;->q0(Lv8/c;)LSd/a;

    move-result-object v1

    invoke-interface {v1, v0, p1}, LSd/a;->a(Ljava/lang/String;Ljava/util/Set;)Lgg/b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LSd/d$a$a$a;

    invoke-virtual {p0, p1}, Lv8/c$c;->a(LSd/d$a$a$a;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
