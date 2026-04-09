.class Lwh/G0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field private final a:Lwh/H0;


# direct methods
.method public constructor <init>(Lwh/H0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwh/G0;->a:Lwh/H0;

    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lwh/G0;->a:Lwh/H0;

    invoke-static {v0}, Lwh/H0;->q0(Lwh/H0;)Ljava/lang/reflect/Member;

    move-result-object v0

    return-object v0
.end method
