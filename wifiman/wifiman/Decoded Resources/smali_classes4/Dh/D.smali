.class LDh/D;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field private final a:LDh/F;


# direct methods
.method public constructor <init>(LDh/F;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LDh/D;->a:LDh/F;

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LDh/D;->a:LDh/F;

    check-cast p1, LZh/c;

    invoke-static {v0, p1}, LDh/F;->B0(LDh/F;LZh/c;)LBh/U;

    move-result-object p1

    return-object p1
.end method
