.class final LP8/e$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LP8/e;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LP8/e;


# direct methods
.method constructor <init>(LP8/e;)V
    .locals 0

    iput-object p1, p0, LP8/e$c;->a:LP8/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LP8/e$a;)Ljava/lang/Float;
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LP8/e$c;->a:LP8/e;

    invoke-static {v0, p1}, LP8/e;->q0(LP8/e;LP8/e$a;)F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LP8/e$a;

    invoke-virtual {p0, p1}, LP8/e$c;->a(LP8/e$a;)Ljava/lang/Float;

    move-result-object p1

    return-object p1
.end method
