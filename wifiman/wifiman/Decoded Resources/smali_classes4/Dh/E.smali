.class LDh/E;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field private final a:LDh/F;


# direct methods
.method public constructor <init>(LDh/F;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LDh/E;->a:LDh/F;

    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LDh/E;->a:LDh/F;

    invoke-static {v0}, LDh/F;->G0(LDh/F;)LDh/l;

    move-result-object v0

    return-object v0
.end method
