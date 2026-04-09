.class public final LNh/G$b$a;
.super LNh/G$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LNh/G$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:LBh/e;


# direct methods
.method public constructor <init>(LBh/e;)V
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, LNh/G$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, LNh/G$b$a;->a:LBh/e;

    return-void
.end method


# virtual methods
.method public final a()LBh/e;
    .locals 1

    iget-object v0, p0, LNh/G$b$a;->a:LBh/e;

    return-object v0
.end method
