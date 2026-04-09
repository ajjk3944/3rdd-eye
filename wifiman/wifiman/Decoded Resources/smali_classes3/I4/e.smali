.class public final LI4/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LM4/o;


# direct methods
.method public constructor <init>(LM4/o;)V
    .locals 1

    const-string/jumbo v0, "userMetadata"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LI4/e;->a:LM4/o;

    return-void
.end method
