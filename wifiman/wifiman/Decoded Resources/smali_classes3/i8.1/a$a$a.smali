.class public final Li8/a$a$a;
.super Li8/a$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li8/a$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:Lmh/l;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lmh/l;)V
    .locals 1

    const-string/jumbo v0, "builder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Li8/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Li8/a$a$a;->a:Lmh/l;

    return-void
.end method


# virtual methods
.method public final a()Lmh/l;
    .locals 1

    iget-object v0, p0, Li8/a$a$a;->a:Lmh/l;

    return-object v0
.end method
