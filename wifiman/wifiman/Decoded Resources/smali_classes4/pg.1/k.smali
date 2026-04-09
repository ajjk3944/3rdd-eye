.class public final Lpg/k;
.super Lgg/b;
.source "SourceFile"


# instance fields
.field final a:Ljava/lang/Throwable;


# direct methods
.method public constructor <init>(Ljava/lang/Throwable;)V
    .locals 0

    invoke-direct {p0}, Lgg/b;-><init>()V

    iput-object p1, p0, Lpg/k;->a:Ljava/lang/Throwable;

    return-void
.end method


# virtual methods
.method protected V(Lgg/d;)V
    .locals 1

    iget-object v0, p0, Lpg/k;->a:Ljava/lang/Throwable;

    invoke-static {v0, p1}, Llg/c;->error(Ljava/lang/Throwable;Lgg/d;)V

    return-void
.end method
