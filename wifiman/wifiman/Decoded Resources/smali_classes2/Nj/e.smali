.class final LNj/e;
.super Lgg/s;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LNj/e$a;
    }
.end annotation


# instance fields
.field private final a:Lgg/s;


# direct methods
.method constructor <init>(Lgg/s;)V
    .locals 0

    invoke-direct {p0}, Lgg/s;-><init>()V

    iput-object p1, p0, LNj/e;->a:Lgg/s;

    return-void
.end method


# virtual methods
.method protected L0(Lgg/x;)V
    .locals 2

    iget-object v0, p0, LNj/e;->a:Lgg/s;

    new-instance v1, LNj/e$a;

    invoke-direct {v1, p1}, LNj/e$a;-><init>(Lgg/x;)V

    invoke-virtual {v0, v1}, Lgg/s;->d(Lgg/x;)V

    return-void
.end method
