.class public final LI3/d$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LI3/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:J

.field private b:I

.field private final c:Z

.field private final d:LC3/t;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide v0, 0x7fffffffffffffffL

    iput-wide v0, p0, LI3/d$a;->a:J

    const/4 v0, 0x0

    iput v0, p0, LI3/d$a;->b:I

    iput-boolean v0, p0, LI3/d$a;->c:Z

    const/4 v0, 0x0

    iput-object v0, p0, LI3/d$a;->d:LC3/t;

    return-void
.end method


# virtual methods
.method public a()LI3/d;
    .locals 7

    new-instance v6, LI3/d;

    iget-wide v1, p0, LI3/d$a;->a:J

    iget v3, p0, LI3/d$a;->b:I

    iget-boolean v4, p0, LI3/d$a;->c:Z

    iget-object v5, p0, LI3/d$a;->d:LC3/t;

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, LI3/d;-><init>(JIZLC3/t;)V

    return-object v6
.end method
