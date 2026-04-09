.class public final LT/l0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ljava/lang/Object;

.field private final b:LT/E;

.field private final c:LT/b1;

.field private final d:LT/d;

.field private e:Ljava/util/List;

.field private final f:LT/A0;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LT/j0;Ljava/lang/Object;LT/E;LT/b1;LT/d;Ljava/util/List;LT/A0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LT/l0;->a:Ljava/lang/Object;

    iput-object p3, p0, LT/l0;->b:LT/E;

    iput-object p4, p0, LT/l0;->c:LT/b1;

    iput-object p5, p0, LT/l0;->d:LT/d;

    iput-object p6, p0, LT/l0;->e:Ljava/util/List;

    iput-object p7, p0, LT/l0;->f:LT/A0;

    return-void
.end method


# virtual methods
.method public final a()LT/d;
    .locals 1

    iget-object v0, p0, LT/l0;->d:LT/d;

    return-object v0
.end method

.method public final b()LT/E;
    .locals 1

    iget-object v0, p0, LT/l0;->b:LT/E;

    return-object v0
.end method

.method public final c()LT/j0;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final d()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LT/l0;->e:Ljava/util/List;

    return-object v0
.end method

.method public final e()LT/A0;
    .locals 1

    iget-object v0, p0, LT/l0;->f:LT/A0;

    return-object v0
.end method

.method public final f()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LT/l0;->a:Ljava/lang/Object;

    return-object v0
.end method

.method public final g()LT/b1;
    .locals 1

    iget-object v0, p0, LT/l0;->c:LT/b1;

    return-object v0
.end method
