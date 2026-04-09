.class Lli/F;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field private final a:Lli/K;

.field private final b:Z

.field private final c:LUh/n;


# direct methods
.method public constructor <init>(Lli/K;ZLUh/n;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lli/F;->a:Lli/K;

    iput-boolean p2, p0, Lli/F;->b:Z

    iput-object p3, p0, Lli/F;->c:LUh/n;

    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lli/F;->a:Lli/K;

    iget-boolean v1, p0, Lli/F;->b:Z

    iget-object v2, p0, Lli/F;->c:LUh/n;

    invoke-static {v0, v1, v2}, Lli/K;->d(Lli/K;ZLUh/n;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
