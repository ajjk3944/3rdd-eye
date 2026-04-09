.class public final LT/T0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:LT/S0;

.field private b:LT/d;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LT/S0;LT/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LT/T0;->a:LT/S0;

    iput-object p2, p0, LT/T0;->b:LT/d;

    return-void
.end method


# virtual methods
.method public final a()LT/d;
    .locals 1

    iget-object v0, p0, LT/T0;->b:LT/d;

    return-object v0
.end method

.method public final b()LT/S0;
    .locals 1

    iget-object v0, p0, LT/T0;->a:LT/S0;

    return-object v0
.end method
