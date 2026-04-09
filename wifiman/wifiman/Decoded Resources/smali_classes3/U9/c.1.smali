.class public final synthetic LU9/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:LEb/w;


# direct methods
.method public synthetic constructor <init>(LEb/w;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LU9/c;->a:LEb/w;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LU9/c;->a:LEb/w;

    invoke-static {v0}, LU9/e;->b(LEb/w;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
