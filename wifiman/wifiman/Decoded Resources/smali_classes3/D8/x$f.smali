.class final LD8/x$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LD8/x;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LD8/x$f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LD8/x$f;

    invoke-direct {v0}, LD8/x$f;-><init>()V

    sput-object v0, LD8/x$f;->a:LD8/x$f;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lje/r;)Ll9/a;
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lje/r$b$a;

    if-eqz v0, :cond_0

    new-instance v0, Ll9/a;

    check-cast p1, Lje/r$b$a;

    invoke-virtual {p1}, Lje/r$b$a;->i()Lke/c;

    move-result-object p1

    invoke-direct {v0, p1}, Ll9/a;-><init>(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance v0, Ll9/a;

    const/4 p1, 0x0

    invoke-direct {v0, p1}, Ll9/a;-><init>(Ljava/lang/Object;)V

    :goto_0
    return-object v0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lje/r;

    invoke-virtual {p0, p1}, LD8/x$f;->a(Lje/r;)Ll9/a;

    move-result-object p1

    return-object p1
.end method
