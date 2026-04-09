.class final Ls2/d$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls2/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation


# instance fields
.field private a:Ls2/c;


# direct methods
.method public constructor <init>(Ls2/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls2/d$b;->a:Ls2/c;

    return-void
.end method


# virtual methods
.method public final a()Ls2/c;
    .locals 1

    iget-object v0, p0, Ls2/d$b;->a:Ls2/c;

    return-object v0
.end method

.method public final b(Ls2/c;)V
    .locals 0

    iput-object p1, p0, Ls2/d$b;->a:Ls2/c;

    return-void
.end method
