.class public final synthetic LF/K;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LI/o;


# instance fields
.field public final synthetic a:LF/L;


# direct methods
.method public synthetic constructor <init>(LF/L;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LF/K;->a:LF/L;

    return-void
.end method


# virtual methods
.method public final a(II)I
    .locals 1

    iget-object v0, p0, LF/K;->a:LF/L;

    invoke-static {v0, p1, p2}, LF/L;->a(LF/L;II)I

    move-result p1

    return p1
.end method
