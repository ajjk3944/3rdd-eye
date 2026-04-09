.class LDh/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field private final a:LDh/g;


# direct methods
.method public constructor <init>(LDh/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LDh/d;->a:LDh/g;

    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LDh/d;->a:LDh/g;

    invoke-static {v0}, LDh/g;->G0(LDh/g;)Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method
