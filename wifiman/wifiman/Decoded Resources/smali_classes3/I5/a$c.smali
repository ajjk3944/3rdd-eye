.class final LI5/a$c;
.super Lgg/s;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LI5/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "c"
.end annotation


# instance fields
.field private final a:Lgg/s;

.field private final b:LI5/a$a;


# direct methods
.method constructor <init>(Lgg/s;LI5/a$a;)V
    .locals 0

    invoke-direct {p0}, Lgg/s;-><init>()V

    iput-object p1, p0, LI5/a$c;->a:Lgg/s;

    iput-object p2, p0, LI5/a$c;->b:LI5/a$a;

    return-void
.end method


# virtual methods
.method protected L0(Lgg/x;)V
    .locals 3

    iget-object v0, p0, LI5/a$c;->a:Lgg/s;

    new-instance v1, LI5/a$d;

    iget-object v2, p0, LI5/a$c;->b:LI5/a$a;

    invoke-direct {v1, p1, v2}, LI5/a$d;-><init>(Lgg/x;LI5/a$a;)V

    invoke-virtual {v0, v1}, Lgg/s;->d(Lgg/x;)V

    return-void
.end method
