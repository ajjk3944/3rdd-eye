.class LDh/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field private final a:LDh/g;


# direct methods
.method public constructor <init>(LDh/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LDh/e;->a:LDh/g;

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LDh/e;->a:LDh/g;

    check-cast p1, Lpi/M0;

    invoke-static {v0, p1}, LDh/g;->K0(LDh/g;Lpi/M0;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
