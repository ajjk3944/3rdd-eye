.class final LM8/A$p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM8/A;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LM8/A;


# direct methods
.method constructor <init>(LM8/A;)V
    .locals 0

    iput-object p1, p0, LM8/A$p;->a:LM8/A;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lic/b;)LGf/h;
    .locals 2

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LGf/h;

    iget-object v1, p0, LM8/A$p;->a:LM8/A;

    invoke-static {v1}, LM8/A;->M0(LM8/A;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, p1, v1}, LGf/h;-><init>(Lic/b;Ljava/util/List;)V

    return-object v0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lic/b;

    invoke-virtual {p0, p1}, LM8/A$p;->a(Lic/b;)LGf/h;

    move-result-object p1

    return-object p1
.end method
