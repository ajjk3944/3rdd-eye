.class LD1/m$e;
.super LD1/m$d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LD1/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "e"
.end annotation


# instance fields
.field private final b:Z


# direct methods
.method constructor <init>(LD1/m$c;Z)V
    .locals 0

    invoke-direct {p0, p1}, LD1/m$d;-><init>(LD1/m$c;)V

    iput-boolean p2, p0, LD1/m$e;->b:Z

    return-void
.end method


# virtual methods
.method protected b()Z
    .locals 1

    iget-boolean v0, p0, LD1/m$e;->b:Z

    return v0
.end method
