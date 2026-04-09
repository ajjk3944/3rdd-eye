.class public final synthetic Ltb/T;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/a;


# instance fields
.field public final synthetic a:LGb/f;

.field public final synthetic b:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(LGb/f;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltb/T;->a:LGb/f;

    iput-object p2, p0, Ltb/T;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Ltb/T;->a:LGb/f;

    iget-object v1, p0, Ltb/T;->b:Ljava/lang/String;

    invoke-static {v0, v1}, Ltb/V;->c(LGb/f;Ljava/lang/String;)V

    return-void
.end method
