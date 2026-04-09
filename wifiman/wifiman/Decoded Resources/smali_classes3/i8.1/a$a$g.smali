.class public final Li8/a$a$g;
.super Li8/a$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li8/a$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "g"
.end annotation


# instance fields
.field private final a:Lhc/a;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lhc/a;)V
    .locals 1

    const-string/jumbo v0, "toast"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Li8/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Li8/a$a$g;->a:Lhc/a;

    return-void
.end method


# virtual methods
.method public final a()Lhc/a;
    .locals 1

    iget-object v0, p0, Li8/a$a$g;->a:Lhc/a;

    return-object v0
.end method
