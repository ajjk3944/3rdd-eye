.class final Lxd/d$d$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lxd/d$d;->a(LIa/a;)Lgg/D;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LIa/a;


# direct methods
.method constructor <init>(LIa/a;)V
    .locals 0

    iput-object p1, p0, Lxd/d$d$b;->a:LIa/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LIa/a$c;)LIa/a;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lxd/d$d$b;->a:LIa/a;

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIa/a$c;

    invoke-virtual {p0, p1}, Lxd/d$d$b;->a(LIa/a$c;)LIa/a;

    move-result-object p1

    return-object p1
.end method
