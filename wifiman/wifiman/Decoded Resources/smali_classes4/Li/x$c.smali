.class final LLi/x$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LLi/x;->d()Lmh/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LLi/x$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LLi/x$c;

    invoke-direct {v0}, LLi/x$c;-><init>()V

    sput-object v0, LLi/x$c;->a:LLi/x$c;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Void;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LLi/x$c;->a()Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method
