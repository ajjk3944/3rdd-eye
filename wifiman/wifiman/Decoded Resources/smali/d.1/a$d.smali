.class public final Ld/a$d;
.super Lc/F;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ld/a;->a(ZLmh/a;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic d:LT/z1;


# direct methods
.method constructor <init>(ZLT/z1;)V
    .locals 0

    iput-object p2, p0, Ld/a$d;->d:LT/z1;

    invoke-direct {p0, p1}, Lc/F;-><init>(Z)V

    return-void
.end method


# virtual methods
.method public d()V
    .locals 1

    iget-object v0, p0, Ld/a$d;->d:LT/z1;

    invoke-static {v0}, Ld/a;->c(LT/z1;)Lmh/a;

    move-result-object v0

    invoke-interface {v0}, Lmh/a;->invoke()Ljava/lang/Object;

    return-void
.end method
