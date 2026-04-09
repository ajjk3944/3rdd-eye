.class final Ls8/b$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ls8/b$b;->a(LGe/g;)LDj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LGe/g;


# direct methods
.method constructor <init>(LGe/g;)V
    .locals 0

    iput-object p1, p0, Ls8/b$b$a;->a:LGe/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Long;)Ls8/b$a$b;
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ls8/b$a$b;

    iget-object v0, p0, Ls8/b$b$a;->a:LGe/g;

    invoke-interface {v0}, LGe/g;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ls8/b$a$b;-><init>(Ljava/lang/String;)V

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p0, p1}, Ls8/b$b$a;->a(Ljava/lang/Long;)Ls8/b$a$b;

    move-result-object p1

    return-object p1
.end method
