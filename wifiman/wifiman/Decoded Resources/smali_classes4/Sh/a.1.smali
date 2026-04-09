.class LSh/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field private final a:LSh/d;


# direct methods
.method public constructor <init>(LSh/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LSh/a;->a:LSh/d;

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LSh/a;->a:LSh/d;

    check-cast p1, LSh/x;

    invoke-static {v0, p1}, LSh/d;->B(LSh/d;LSh/x;)LSh/g;

    move-result-object p1

    return-object p1
.end method
