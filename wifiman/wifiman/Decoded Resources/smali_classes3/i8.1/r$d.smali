.class final Li8/r$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li8/r;-><init>(Li8/a;Li8/s$d;Lcom/ubnt/usurvey/ui/teleport/deeplink/a;LN8/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Li8/r$d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Li8/r$d;

    invoke-direct {v0}, Li8/r$d;-><init>()V

    sput-object v0, Li8/r$d;->a:Li8/r$d;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LN8/a$a;)Ljava/lang/Boolean;
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of p1, p1, LN8/a$a$b;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LN8/a$a;

    invoke-virtual {p0, p1}, Li8/r$d;->a(LN8/a$a;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
