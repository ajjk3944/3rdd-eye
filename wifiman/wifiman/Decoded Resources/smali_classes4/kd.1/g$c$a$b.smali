.class final Lkd/g$c$a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkd/g$c$a;->a(LIa/a;)Lgg/D;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lkd/g;


# direct methods
.method constructor <init>(Lkd/g;)V
    .locals 0

    iput-object p1, p0, Lkd/g$c$a$b;->a:Lkd/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LLa/b;)Lkd/e;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lkd/g$c$a$b;->a:Lkd/g;

    invoke-static {v0, p1}, Lkd/g;->c(Lkd/g;LLa/b;)Lkd/e;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LLa/b;

    invoke-virtual {p0, p1}, Lkd/g$c$a$b;->a(LLa/b;)Lkd/e;

    move-result-object p1

    return-object p1
.end method
