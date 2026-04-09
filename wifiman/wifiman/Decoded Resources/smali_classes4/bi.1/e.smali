.class Lbi/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/reflect/jvm/internal/impl/types/checker/e$a;


# instance fields
.field private final a:Z

.field private final b:LBh/a;

.field private final c:LBh/a;


# direct methods
.method public constructor <init>(ZLBh/a;LBh/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lbi/e;->a:Z

    iput-object p2, p0, Lbi/e;->b:LBh/a;

    iput-object p3, p0, Lbi/e;->c:LBh/a;

    return-void
.end method


# virtual methods
.method public a(Lpi/v0;Lpi/v0;)Z
    .locals 3

    iget-boolean v0, p0, Lbi/e;->a:Z

    iget-object v1, p0, Lbi/e;->b:LBh/a;

    iget-object v2, p0, Lbi/e;->c:LBh/a;

    invoke-static {v0, v1, v2, p1, p2}, Lbi/g;->c(ZLBh/a;LBh/a;Lpi/v0;Lpi/v0;)Z

    move-result p1

    return p1
.end method
