.class public final LBh/W;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LBh/i;

.field private final b:Ljava/util/List;

.field private final c:LBh/W;


# direct methods
.method public constructor <init>(LBh/i;Ljava/util/List;LBh/W;)V
    .locals 1

    const-string v0, "classifierDescriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "arguments"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LBh/W;->a:LBh/i;

    iput-object p2, p0, LBh/W;->b:Ljava/util/List;

    iput-object p3, p0, LBh/W;->c:LBh/W;

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LBh/W;->b:Ljava/util/List;

    return-object v0
.end method

.method public final b()LBh/i;
    .locals 1

    iget-object v0, p0, LBh/W;->a:LBh/i;

    return-object v0
.end method

.method public final c()LBh/W;
    .locals 1

    iget-object v0, p0, LBh/W;->c:LBh/W;

    return-object v0
.end method
