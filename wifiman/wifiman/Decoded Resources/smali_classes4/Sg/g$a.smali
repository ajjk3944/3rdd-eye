.class final LSg/g$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LSg/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# instance fields
.field a:LSg/b;

.field b:LSg/g;

.field c:J


# direct methods
.method constructor <init>(LSg/b;LSg/g;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LSg/g$a;->a:LSg/b;

    iput-object p2, p0, LSg/g$a;->b:LSg/g;

    iput-wide p3, p0, LSg/g$a;->c:J

    return-void
.end method
