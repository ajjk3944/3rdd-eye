.class public LG6/z$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LG6/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private a:Z

.field private b:Z

.field private c:LG6/S;


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, LG6/z$a;->a:Z

    iput-boolean v0, p0, LG6/z$a;->b:Z

    new-instance v0, LG6/S;

    const-wide/16 v1, 0x1e

    sget-object v3, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-direct {v0, v1, v2, v3}, LG6/S;-><init>(JLjava/util/concurrent/TimeUnit;)V

    iput-object v0, p0, LG6/z$a;->c:LG6/S;

    return-void
.end method


# virtual methods
.method public a()LG6/z;
    .locals 4

    new-instance v0, LG6/z;

    iget-boolean v1, p0, LG6/z$a;->a:Z

    iget-boolean v2, p0, LG6/z$a;->b:Z

    iget-object v3, p0, LG6/z$a;->c:LG6/S;

    invoke-direct {v0, v1, v2, v3}, LG6/z;-><init>(ZZLG6/S;)V

    return-object v0
.end method

.method public b(Z)LG6/z$a;
    .locals 0

    iput-boolean p1, p0, LG6/z$a;->a:Z

    return-object p0
.end method

.method public c(Z)LG6/z$a;
    .locals 0

    iput-boolean p1, p0, LG6/z$a;->b:Z

    return-object p0
.end method
