.class public final synthetic Lo5/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La3/g;


# instance fields
.field public final synthetic a:Lo5/g;


# direct methods
.method public synthetic constructor <init>(Lo5/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo5/f;->a:Lo5/g;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lo5/f;->a:Lo5/g;

    check-cast p1, Lo5/z;

    invoke-static {v0, p1}, Lo5/g;->b(Lo5/g;Lo5/z;)[B

    move-result-object p1

    return-object p1
.end method
