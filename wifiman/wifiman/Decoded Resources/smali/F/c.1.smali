.class public final synthetic LF/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LI/o;


# instance fields
.field public final synthetic a:LT/z1;


# direct methods
.method public synthetic constructor <init>(LT/z1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LF/c;->a:LT/z1;

    return-void
.end method


# virtual methods
.method public final a(II)I
    .locals 1

    iget-object v0, p0, LF/c;->a:LT/z1;

    invoke-static {v0, p1, p2}, LF/d;->a(LT/z1;II)I

    move-result p1

    return p1
.end method
